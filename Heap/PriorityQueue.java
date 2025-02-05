import java.util.Arrays;

class PriorityQueue {
    private int[] heap;
    private int size;

    public PriorityQueue(int capacity) {
        heap = new int[capacity + 1]; // 1-based index
        size = 0;
    }

    public boolean isFull() {
        return size == heap.length - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Priority Queue is full");
            return;
        }
        heap[++size] = value;
        int current = size;
        while (current > 1 && heap[current] > heap[current / 2]) {
            swap(heap, current, current / 2);
            current /= 2;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return -1;
        }
        int max = heap[1];
        heap[1] = heap[size--];
        heapify(heap, size, 1);
        return max;
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);
        pq.insert(10);
        pq.insert(20);
        pq.insert(15);
        pq.insert(40);
        pq.insert(50);
        pq.insert(100);
        pq.insert(25);
        pq.insert(45);
        pq.insert(60);
        pq.insert(35);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}

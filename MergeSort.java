public class MergeSort {

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for(int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        int arr[] = {5,3,4,1,2};
        sort(arr, 0, arr.length - 1);

        for(int num : arr)
            System.out.print(num + " ");
    }
}



1. Valid Parentheses
Problem

Given a string containing ()[]{}, determine if the parentheses are valid.

Example
Input: "()[]{}"
Output: true
Java Code
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else {
                if(st.isEmpty()) return false;

                char top = st.pop();
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(isValid("()[]{}"));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)

2. Next Greater Element
Problem

For each element, find the next greater element on the right.

Example
Input: [4,5,2,10]
Output: [5,10,10,-1]
Java Code
import java.util.Stack;

public class NextGreater {
    public static void nge(int[] arr){
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                System.out.print(-1 + " ");
            } else {
                System.out.print(st.peek() + " ");
            }

            st.push(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr = {4,5,2,10};
        nge(arr);
    }
}

Time Complexity: O(n)

3. Remove Adjacent Duplicates
Problem

Remove adjacent duplicate characters.

Input: abbaca
Output: ca
Java Code
import java.util.Stack;

public class RemoveDuplicates {
    public static String remove(String s){
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            } else {
                st.push(c);
            }
        }

        String result = "";
        for(char c : st){
            result += c;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(remove("abbaca"));
    }
}
QUEUE QUESTIONS (Most Repeated)
4. Implement Queue Using Array
class Queue {
    int front = 0;
    int rear = -1;
    int size = 5;
    int[] arr = new int[size];

    void enqueue(int x){
        if(rear == size - 1){
            System.out.println("Queue Full");
        } else {
            arr[++rear] = x;
        }
    }

    void dequeue(){
        if(front > rear){
            System.out.println("Queue Empty");
        } else {
            System.out.println("Removed: " + arr[front++]);
        }
    }

    void display(){
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
5. Generate Binary Numbers Using Queue
Example
Input: 5
Output: 1 10 11 100 101
Java Code
import java.util.LinkedList;
import java.util.Queue;

public class BinaryQueue {
    public static void generate(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for(int i = 0; i < n; i++){
            String s = q.poll();
            System.out.print(s + " ");

            q.add(s + "0");
            q.add(s + "1");
        }
    }

    public static void main(String[] args){
        generate(5);
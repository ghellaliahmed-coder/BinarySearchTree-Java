# Binary Search Tree (BST) Demo in Java

A lightweight, educational Java implementation of a **Binary Search Tree (BST)** data structure. This repository demonstrates core tree operations including insertion, deletion, searching, min/max lookups, and depth-first traversals.

## 📁 Project Structure

All files are located within the `bstdemo` package:

* **`Node.java`**: Represents an individual tree node storing integer `data`, along with `left` and `right` child references, getters/setters, and a custom `toString()` method.
* **`BST.java`**: Contains the core Binary Search Tree logic and recursive helper methods.
* **`BSTdemo.java`**: The driver/main class that populates a sample tree, checks min/max values, performs search and delete operations, and prints the results to the console.

## ✨ Features & Operations

The `BST` class supports the following operations:

* **Insertion (`insertNode(int d)`)**: Recursively inserts unique integer values into their appropriate sorted positions.
* **Search (`searchNode(int d)`)**: Searches the tree for a target value and prints `"Item Found!"` or `"Item Not Found!"`.
* **Deletion (`deleteNode(int d)`)**: Handles all three BST deletion cases:
  1. Deleting a leaf node (no children).
  2. Deleting a node with one child.
  3. Deleting a node with two children (replacing it with the minimum value from its right subtree).
* **Min / Max Lookups (`findMin(Node root)`, `findMax(Node root)`)**: Traverses the leftmost or rightmost branches to return the minimum and maximum values in a subtree.
* **Traversals**:
  * **In-Order (`inOrder()`)**: Prints elements in ascending sorted order ($\text{Left} \rightarrow \text{Root} \rightarrow \text{Right}$).
  * **Pre-Order (`preOrder()`)**: Prints root before subtrees ($\text{Root} \rightarrow \text{Left} \rightarrow \text{Right}$).
  * **Post-Order (`postOrder()`)**: Prints root after subtrees ($\text{Left} \rightarrow \text{Right} \rightarrow \text{Root}$).

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher.

### Running via Terminal / Command Prompt

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/bstdemo.git
   cd bstdemo
   ```

2. **Compile the Java files:**
   *(Ensure your `.java` files are inside a `bstdemo/` directory to match the package declaration)*
   ```bash
   javac bstdemo/*.java
   ```

3. **Run the demo:**
   ```bash
   java bstdemo.BSTdemo
   ```

## 🖥️ Sample Output

Running `BSTdemo` inserts `{20, 15, 25, 12, 18, 30, 10, 14, 19, 27, 35, 13}`, displays the max and min values, searches for `27`, deletes `27`, and verifies the updated tree:

```text
========================================

MAX Item = 35
MIN Item = 10

========================================

In-Order : 
10
12
13
14
15
18
19
20
25
27
30
35

Searching for '27': Item Found!

========================================

After Deleting '27' : 

Updated In-Order: 
10
12
13
14
15
18
19
20
25
30
35

Searching for 27 again: Item Not Found!

========================================
```

## 📄 License

This project is open-source and available for educational and personal use.

# Sorting Algorithm Benchmark

This project benchmarks various sorting algorithms under different scenarios. It evaluates performance across input sizes, input types (sorted, reverse, random), and sorting techniques.

## Features
- Benchmarks multiple sorting algorithms:
  - Bubble Sort
  - Quick Sort
  - Merge Sort
  - Selection Sort
  - Insertion Sort
- Tests performance across input sizes and input types.
- Provides a framework for comparing sorting algorithm efficiency.

## Project Structure
- `src/main/java`: Main source code.
  - `com.kaymeer.benchmark`: Core benchmarking logic.
  - `com.kaymeer.Main`: Entry point of the application.

## Requirements
- Java 23 or higher
- Maven 4.0.0 or higher

## Getting Started
1. Clone the repository:
   ```
   git clone https://github.com/kaymeer/sorting-algorithm-benchmark
   cd sorting-algorithm-benchmark
   ```

2. Build the project using Maven:
   ```
   mvn clean install
   ```

3. Run the benchmarks:
   ```
   java -cp target/sorting-algorithm-benchmark-1.0-jar-with-dependencies.jar com.kaymeer.Main
   ```

## How to Contribute
1. Fork the repository.
2. Create a feature branch:
   ```
   git checkout -b feature/new-feature
   ```
3. Commit your changes and push to the branch:
   ```
   git commit -m "Add new feature"
   git push origin feature/new-feature
   ```
4. Open a pull request.

## License
This project is licensed under the GPL-3.0 License. See `LICENSE` for more details.

## Disclaimer
This project was made for educational purposes.
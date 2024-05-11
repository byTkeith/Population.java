# Continuous Population Mating Program

## Author: Tendai K. Nyevedzanai

This Java program simulates continuous population mating. It reads input from a file, processes the mating pairs, and combines their genetic material. The resulting offspring are stored in a string format.

### Usage

1. Compile the `Population.java` file:
   ```bash
   javac Population.java
   ```

2. Run the program:
   ```bash
   java Population
   ```

3. When prompted, enter the name of the input file containing the population data.

### Input File Format

The input file should have the following structure:

1. The first line contains an integer representing the total population size.
2. The next lines contain strings representing individuals in the population.
3. The next line contains an integer representing the number of mating pairs.
4. The remaining lines contain pairs of integers representing the indices of individuals to mate.

### Example Input File

```
5
Alice
Bob
Charlie
David
Eve
3
1 2
3 4
2 5
```

### Mating Logic

The program combines the genetic material of the specified individuals and produces offspring strings. If the combined string length is less than 10 characters, it appends additional characters from the original strings.


### Output

The program prints the resulting offspring strings after mating.

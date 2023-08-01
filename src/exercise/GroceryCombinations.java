package exercise;

import java.util.ArrayList;
import java.util.*;

public class GroceryCombinations {

  public static List<List<String>> getGroceryCombinations(List<String[]> groceries, int k) {
    List<List<String>> combinations = new ArrayList<>();
    for (int i = 0; i < groceries.size(); i++) {
      int price = Integer.parseInt(groceries.get(i)[1]);
      if (price > 0 && price <= k) {
        List<String> combination = new ArrayList<>();
        combination.add(groceries.get(i)[0]);
        k -= price;
        combinations.add(combination);
      }
    }
    return combinations;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount of money:");
    int k = scanner.nextInt();
    List<String[]> groceries = new ArrayList<>();
    groceries.add(new String[]{"Item1", "20"});
    groceries.add(new String[]{"Item2", "10"});
    groceries.add(new String[]{"Item3", "60"});
    groceries.add(new String[]{"Item4", "40"});
    groceries.add(new String[]{"Item5", "30"});
    groceries.add(new String[]{"Item6", "200"});
    groceries.add(new String[]{"Item7", "250"});
    List<List<String>> combinations = getGroceryCombinations(groceries, k);
    for (List<String> combination : combinations) {
      System.out.println(combination);
    }
  }
}

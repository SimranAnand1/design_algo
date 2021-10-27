package daa;
import java.io.*;
class OptimalBST 
{
 static int sum(int freq[], int left_idx, int
right_idx)
 {
 int sum = 0;
 for (int i=left_idx; i <= right_idx; ++i)
 sum += freq[i];
 return sum;
 }
 
 static int getTotalCostOfOptimalBST(int keys[], int
freq[], int num_keys)
 {
 int DP_Table[][] = new int[num_keys][num_keys];
 
 for (int j = 0; j < num_keys; ++j)
 {
 for (int i = j; i >= 0; --i)
 {
 int min_total_cost = Integer.MAX_VALUE,
 sum_freq = sum(freq, i, j);
 
 for (int k = i; k <= j; ++k)
 {
 int total_cost = 0,
 total_cost_left_subtree = 0,
total_cost_right_subtree = 0;
 if (k > i)
 total_cost_left_subtree = 
DP_Table[i][k-1];
 
 if (k < j)
 total_cost_right_subtree = 
DP_Table[k+1][j];
 
total_cost = ( total_cost_left_subtree
 + 
total_cost_right_subtree
+ sum_freq );
 
if (total_cost < min_total_cost)
 min_total_cost = total_cost;
 }
 
 DP_Table[i][j] = min_total_cost;
 }
 }
 return DP_Table[0][num_keys-1];
 }
 public static void main (String[] args) 
 {
 int keys[] = {10,20,30};
 int freq[] = {3,2,5};
 int num_keys = keys.length;
 
 System.out.println("Total cost of Optimal BST is "
 + 
getTotalCostOfOptimalBST(keys, freq, num_keys));
 }
}
// Product of Digits of Sum
// Link: https://edabit.com/challenge/PZh6svj6RjiQishTG
public class ProductOfDigitsOfSum {
  public static long sumDigProd(int... nums) {
    int n = 0;
    for (int i: nums) {
      n += i;
    }
    int oneDig = 1;
    while(oneDig == 1) { 
      String snum = String.valueOf(n);
      if(snum.length() < 2) {
        oneDig = 0;
      } else {
        n = 1;
			  for(int i = 0; i < snum.length(); i++) { 
				  n *= Integer.parseInt(snum.substring(i, i+1));
			  }
      }
		}
    return n;
	}
  public static void main(String[] args){
    System.out.println(sumDigProd(16, 28));
    System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
    System.out.println(sumDigProd(0));
  }

}

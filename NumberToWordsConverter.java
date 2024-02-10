import java.util.*;
class NumberToWordsConverter
{
	public static final String[] units={"","one","two","three","four","five","six","seven","eight","nine"};
	public static final String[] teen={"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public static final String[] ten={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the any number");
		long number=s1.nextLong();
		if(number==0)
		{
			System.out.println("zero");
		}
		else
		{
			System.out.println("in words: "  + convertNumberToWords(number));
		}
	}
	public static String convertNumberToWords(long number)
	{
		if(number<0)
		{
			return "negative" + convertNumberToWords(-number);
		}
		if(number==0)
		{
			return " ";
		}
		if(number<=9)
		{
			return units[(int) number];
		}
		else if(number<=19)
		{
		return teen[(int) (number%10)];
		}
		else if(number<=99)
		{
		return ten[(int)(number/10)]+" "+ convertNumberToWords(number%10);
		}
		else if(number<=999)
		{
		return units[(int)(number/100)]+" hundred "+ convertNumberToWords(number%100);
		}
		 else if (number <= 99_999) {
            return convertNumberToWords(number / 100) + " Thousand " + convertNumberToWords(number % 100);
        } else
		{
		return null;
		}
	}
}
		
/**
*
* @another Mustafa Melih T�fekcio�lu mustafa.tufekcioglu@ogr.sakarya.edu.tr
* @since 29.03.2022
* <p>
* 2.��retim b grubu
* </p>
*/
public class Screen {
	public int relationOperator1;
	public int relationOperator2;
	public int relationOperator;
	public int logicalOperator;
	public int unaryOperator;
	public int binaryOperator;
	public int numericOperator;
	public int numberOfOperands;

	public Screen() {
		RegexOperations regex = new RegexOperations();
		relationOperator1 = regex.RelationalOperatorCount1();
		relationOperator2 = regex.RelationalOperatorCount2();
		logicalOperator = regex.LogicalOperatorCount();
		unaryOperator = regex.NumericOperatorsUnaryCount();
		binaryOperator = regex.NumericOperatorsBinaryCount();

		numericOperator = unaryOperator + binaryOperator;
		relationOperator = relationOperator1 + relationOperator2;
		numberOfOperands = unaryOperator + (binaryOperator * 2) + (relationOperator * 2) + (logicalOperator * 2);

		System.out.println("Operat�r Bilgisi:");
		System.out.println("\tTekli Operat�r Say�s�: " + unaryOperator);
		System.out.println("\t�kili Operat�r Say�s�: " + binaryOperator);
		System.out.println("\tSay�sal Operat�r Say�s�: " + numericOperator);
		System.out.println("\t�li�kisel Operat�r Say�s�: " + relationOperator);
		System.out.println("\tMant�ksal Operat�r Say�s�: " + logicalOperator);
		System.out.println("Operand Bilgisi:");
		System.out.println("\tToplam Operand Say�s�: " + numberOfOperands);

	}
}

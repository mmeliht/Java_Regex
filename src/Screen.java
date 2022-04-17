/**
*
* @another Mustafa Melih Tüfekcioðlu mustafa.tufekcioglu@ogr.sakarya.edu.tr
* @since 29.03.2022
* <p>
* 2.Öðretim b grubu
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

		System.out.println("Operatör Bilgisi:");
		System.out.println("\tTekli Operatör Sayýsý: " + unaryOperator);
		System.out.println("\tÝkili Operatör Sayýsý: " + binaryOperator);
		System.out.println("\tSayýsal Operatör Sayýsý: " + numericOperator);
		System.out.println("\tÝliþkisel Operatör Sayýsý: " + relationOperator);
		System.out.println("\tMantýksal Operatör Sayýsý: " + logicalOperator);
		System.out.println("Operand Bilgisi:");
		System.out.println("\tToplam Operand Sayýsý: " + numberOfOperands);

	}
}

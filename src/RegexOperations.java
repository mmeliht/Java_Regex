/**
*
* @another Mustafa Melih Tüfekcioðlu mustafa.tufekcioglu@ogr.sakarya.edu.tr
* @since 29.03.2022
* <p>
* 2.Öðretim b grubu
* </p>
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexOperations {
	public String subst = "";
	public String resultStr = "";

	public RegexOperations() { // okunan dosyadaki yorum satýrlarýný temizler

		FileReader file = new FileReader();
		final Pattern pattern = Pattern.compile(Regex.CommentLine, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(file.str);

		resultStr = matcher.replaceAll(subst);

	}

	public int RelationalOperatorCount1() { // 1

		int count = 0;
		Pattern pattern = Pattern.compile(Regex.RelationalOperators1, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(resultStr);

		while (matcher.find()) {
			count++;
		}
		resultStr = matcher.replaceAll(subst);

		return count;
	}

	public int RelationalOperatorCount2() { // 2

		int count = 0;
		Pattern pattern = Pattern.compile(Regex.RelationalOperators2, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(resultStr);

		while (matcher.find()) {
			count++;
		}
		resultStr = matcher.replaceAll(subst);
		return count;
	}

	public int LogicalOperatorCount() { // 3
		int count = 0;
		Pattern pattern = Pattern.compile(Regex.LogicalOperators, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(resultStr);

		while (matcher.find()) {
			count++;
		}
		resultStr = matcher.replaceAll(subst);
		return count;
	}

	public int NumericOperatorsUnaryCount() {
		int count = 0;
		Pattern pattern = Pattern.compile(Regex.NumericOperatorsUnary, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(resultStr);

		while (matcher.find()) {
			count++;
		}
		resultStr = matcher.replaceAll(subst);
		return count;
	}

	public int NumericOperatorsBinaryCount() {
		int count = 0;
		Pattern pattern = Pattern.compile(Regex.NumericOperatorsBinary, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(resultStr);

		while (matcher.find()) {
			count++;
		}
		resultStr = matcher.replaceAll(subst);
		return count;
	}
}

/**
 * This is part of the Java SyntaxHighlighter.
 * 
 * It is distributed under MIT license. See the file 'readme.txt' for
 * information on usage and redistribution of this file, and for a
 * DISCLAIMER OF ALL WARRANTIES.
 * 
 * @author Chan Wai Shing <cws1989@gmail.com>
 */
package syntaxhighlighter.Brushes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import syntaxhighlighter.Brush;
import syntaxhighlighter.Brush.RegExpRule;

/**
 * Action Script brush.
 * @author Chan Wai Shing <cws1989@gmail.com>
 */
public class BrushAS3 extends Brush {

    public BrushAS3() {
        super();

        // Created by Peter Atoria @ http://iAtoria.com
        List<RegExpRule> regExpRuleList = new ArrayList<RegExpRule>();
        regExpRuleList.add(new RegExpRule(Brush.RegExpRule.singleLineCComments, "comments")); // one line comments
        regExpRuleList.add(new RegExpRule(Brush.RegExpRule.multiLineCComments, "comments")); // multiline comments
        regExpRuleList.add(new RegExpRule(Brush.RegExpRule.doubleQuotedString, "string")); // double quoted strings
        regExpRuleList.add(new RegExpRule(Brush.RegExpRule.singleQuotedString, "string")); // single quoted strings
        regExpRuleList.add(new RegExpRule("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b", Pattern.CASE_INSENSITIVE, "value")); // numbers
        regExpRuleList.add(new RegExpRule(getKeywords("class interface function package"), Pattern.MULTILINE, "color3")); // initializations
        regExpRuleList.add(new RegExpRule(getKeywords("-Infinity ...rest Array as AS3 Boolean break case catch const continue Date decodeURI "
                + "decodeURIComponent default delete do dynamic each else encodeURI encodeURIComponent escape "
                + "extends false final finally flash_proxy for get if implements import in include Infinity "
                + "instanceof int internal is isFinite isNaN isXMLName label namespace NaN native new null "
                + "Null Number Object object_proxy override parseFloat parseInt private protected public "
                + "return set static String super switch this throw true try typeof uint undefined unescape "
                + "use void while with"), Pattern.MULTILINE, "keyword")); // keywords
        regExpRuleList.add(new RegExpRule("var", Pattern.MULTILINE, "variable")); // variable
        regExpRuleList.add(new RegExpRule("trace", Pattern.MULTILINE, "color1")); // trace
        setRegExpRuleList(regExpRuleList);

        setHTMLScriptRegExp(HTMLScriptRegExp.scriptScriptTags);

        setCommonFileExtensionList(Arrays.asList("as"));
    }
}
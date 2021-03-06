package com.dh.antlr.sqlbuff.misc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;

public class LangDescriptor {
	public String corpusDir; // dir under "corpus/"
	public String fileRegex;
	public Class<? extends Lexer> lexerClass;
	public Class<? extends Parser> parserClass;
	public String startRuleName;
	public int indentSize;
	/** token type of single comment, if any. If your single-comment lexer
	 *  rule matches newline, then this is optional.
	 */
	public int singleLineCommentType;

	public LangDescriptor(String fileRegex,
	                      Class<? extends Lexer> lexerClass,
	                      Class<? extends Parser> parserClass,
	                      String startRuleName,
	                      int indentSize,
	                      int singleLineCommentType)
	{
		this.fileRegex = fileRegex;
		this.lexerClass = lexerClass;
		this.parserClass = parserClass;
		this.startRuleName = startRuleName;
		this.indentSize = indentSize;
		this.singleLineCommentType = singleLineCommentType;
	}
}

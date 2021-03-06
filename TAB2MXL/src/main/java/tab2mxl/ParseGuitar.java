package tab2mxl;

import java.io.File;
import java.util.ArrayList;

import guitar.scorePartwise;
import guitar.Part;
import guitar.Parser;

public class ParseGuitar {
	
	ArrayList<char[][]> tmp = new ArrayList<char[][]>();
	Parser p;
	char[][] parsed;
	Part part;
	scorePartwise sp;
	
	public ArrayList<char[][]> getTmp() {
		return tmp;
	}

	public void setTmp(ArrayList<char[][]> tmp) {
		this.tmp = tmp;
	}

	public Parser getP() {
		return p;
	}

	public void setP(Parser p) {
		this.p = p;
	}

	public char[][] getParsed() {
		return parsed;
	}

	public void setParsed(char[][] parsed) {
		this.parsed = parsed;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public scorePartwise getSp() {
		return sp;
	}

	public void setSp(scorePartwise sp) {
		this.sp = sp;
	}

	public ParseGuitar(File file) {
		this.p = new Parser(file);
		this.parsed = p.getTabCharMatrix();
		this.tmp = p.measureSplitter(parsed);
		this.part = p.createMusicalPart(tmp);
		this.sp = new scorePartwise();
		this.sp.getParts().add(part);
		//System.out.print("hiii" + this.tmp.size());
	}

}

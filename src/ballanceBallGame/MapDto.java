package ballanceBallGame;

import ballanceBallGame.gameTools.GameTools;


public class MapDto {
	public int id;
	public String name;
	public String mapType;
	public String mapHeight;
	public String author;
	public int hightScore;
	public String hsPlayer;
	
	public MapDto(){
		id=0;
		name="test";
		mapType = GameTools.arrayToString(Statics.testMap[0]);
		mapHeight = GameTools.arrayToString(Statics.testHightMap[0]);
		author = "Anonymous";
		hightScore=999999;
		hsPlayer="None";
		
	}

	public MapDto(int selected) {
		// TODO Auto-generated constructor stub
		id=selected;
		name="test";
		mapType = GameTools.arrayToString(Statics.testMap[selected]);
		mapHeight = GameTools.arrayToString(Statics.testHightMap[selected]);
		author = "Anonymous";
		hightScore=999999;
		hsPlayer="None";
	}
}

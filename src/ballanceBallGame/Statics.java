package ballanceBallGame;

public class Statics {
	

	//Map Elements Type
	public static int EMPTY = 0;
	public static int GROUND = 1;
	public static int SLOP_NORTH = 2;
	public static int SLOP_SOUTH = 3;
	public static int SLOP_WEST = 4;
	public static int SLOP1_EAST = 5;
	public static int ACCELERATOR_NORTH = 6;
	public static int ACCELERATOR_SOUTH = 7;
	public static int ACCELERATOR_WEST = 8;
	public static int ACCELERATOR_EAST = 9;
	public static int MUD = 10;
	public static int TARGET = 11;
	public static int GLASS = 11;
	public static int START = 13;
	
	//MapSize
	public static int MAPHIGHT = 16;
	public static int MAPWIDTH = 16;
	
	//
	public static float TOUCH_SCALE_FACTOR = 0.01f;
	public static float TRACKBALL_SCALE_FACTOR = 0.1f;
	//
	public static int CELLSIZE = 0x10000;
	//color 
	public static float[] SKYCOLOR = {0.8f,1.0f,1.0f,1.0f};

	
	//some data for test
	public static int[][][] testMap ={
		{
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,1 ,1 ,1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
			{1 ,1 ,1 ,1 ,1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1 ,13,12,12,12,12,12,12,12,12,12,12,12,12,12,0},
			{1 ,1 ,12,12,12,12,12,12,12,12,12,12,12,12,12,0},
			{1 ,1 ,10,10,10,10,10,10,10,10,10,10,10,10,1 ,11},
			{0 ,0 ,10,10,10,10,10,10,10,10,10,10,10,10,0 ,0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		},{
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{12,1 ,13,1 ,1 ,1, 1, 1, 1, 1, 5,12,12,12,12,12},
			{12,1 ,1 ,1 ,1 ,1, 1, 1, 1, 1, 5,12,12,12,12,12},
			{12,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0,12,12,12,12,12},
			{12,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0,12,12,12,12,12},
			{12,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0,12,12,12,12,12},
			{12,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0,12,12,12,12,12},
			{12,0 ,10,10,10,10,10,10,10,10,5,12,12,12,12,12},
			{12,0 ,10,10,10,10,10,10,10,10,5,12,12,12,12,12},
			{12,0 ,10,0 ,0 ,0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
			{12,0 ,10,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{12,0 ,10,1 ,1 ,1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
			{12,0 ,10,1 ,1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
			{10,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 1, 11, 1, 0, 0},
			{10,10,12,12,12,12,12,12,12,12,12, 1, 1, 1, 0, 0},
			{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		},{
		{12,12,12,12,12,12,12,12,0, 0, 0, 0, 0, 0, 12,12},
		{12,12,12,12,12,12,12,12,0, 0, 0, 1, 1, 1, 12,12},
		{13,5 ,1 ,1 ,5 ,5, 12,12,0, 0, 0, 1,11, 1, 12, 1},
		{2 ,1 ,1 ,1 ,1 ,1, 12,12,0, 0, 0, 1, 1, 1, 12, 1},
		{10,10,0 ,0 ,0 ,0 , 2, 2, 0, 0, 0, 0, 0, 0, 12,1},
		{10,10,10,10,0 ,0 , 2, 2, 0, 0, 0, 0, 0, 0, 2, 2},
		{0 ,0 ,0 ,10,0 ,0 ,12,12,12,12,12,12,12,12,12, 1},
		{10,10,10,10,0 ,0 ,12,12,12,12,12,12,12,12,12, 1},
		{10,10,0 ,0 ,0 ,0 ,12,12,12,12,10,10,10,10, 7, 1},
		{10,10,10,10,10,10,12,12,12,12,10,10,10,10, 1, 1},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	},{
		{10,1 ,1 ,1 ,1 ,1, 1, 1, 12,12,12,0, 12,1 ,10,10},
		{10,1 ,13,1 ,1 ,1, 1, 1, 0, 0, 12,0, 12,1 ,10,10},
		{10,1 ,1 ,1 ,1 ,1, 1, 1, 0, 12,12,0, 12,1 ,10,10},
		{10,10,10,10,1 ,1, 1, 3, 0, 12,0, 0, 12,1 ,10,10},
		{10,10,4 ,4 ,4 ,9, 12,12,0, 12,12,12,12,1 ,10,10},
		{10,10,1 ,1 ,1 ,10,1, 2, 0, 0, 0, 0, 12,1, 10,10},
		{10,10,1 ,1 ,1 ,2, 1, 1, 0, 0, 0, 0, 0 ,3, 3, 3},
		{10,10,5 ,5 ,5 ,10,1, 1, 1, 1, 1, 1, 0, 12,12,12},
		{10,10,5 ,5 ,5 ,10,1, 1, 1, 1, 1, 1, 0, 12,12,12},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 12,12,12},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 10,10,10},
		{1 ,1 ,12,10,0 ,0, 1, 1, 1, 10,10,10,0, 3, 3, 3},
		{1 ,1 ,1 ,12,0 ,0, 1, 1, 1, 1, 4, 1, 0, 8, 8,12},
		{1 ,11,1 ,1 ,1 ,1, 1, 1, 1, 1, 1, 1, 0, 8, 8,12},
		{1 ,1 ,1 ,12,0 ,0, 1, 1, 1, 1, 1, 1, 0, 10,10,10},
		{1 ,1 ,12,10,0 ,0, 1, 1, 1, 10,10,10,0, 10,10,10},
	},{
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,1 ,1 ,1 ,1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
		{0 ,0 ,1 ,13,1 ,9,12,12,12,12,12,12,12,12,12, 1},
		{0 ,0 ,1 ,1 ,1, 9,12,12,12,12,12,12,12, 6,12, 1},
		{0 ,0 ,1 ,1,11 ,1, 0,12, 0, 0, 0, 0, 0,12,12, 0},
		{0 ,0 ,10,0,12,4 , 4,12, 0, 0, 0, 0, 0,12,12, 0},
		{0 ,0 ,10,0,12,0, 0, 12, 0, 0, 0, 0, 0,12,12, 0},
		{0 ,0 ,10,0,12 ,1, 1,12,12,12,12,12,12,12,12, 1},
		{0 ,0 ,10,0,12 ,1, 1,12,12,12,12,12, 8,12, 5, 1},
		{0 ,0 ,10,0,12 ,0, 0,12, 0, 0, 0, 0, 1, 1, 1, 1},
		{0 ,0 ,10,0,12 ,0, 0,12, 0, 0, 0, 0, 3, 0, 0, 0},
		{0 ,0 ,10,0,12 ,0,10,10, 5, 5,10,10, 1, 0, 0, 0},
		{0 ,0 ,10,0,12 ,0,10,10, 5, 5,10,10, 0, 0, 0, 0},
		{0 ,0,10,10,10,10,10,10,10,10,10,10, 0, 0, 0, 0},
		{0 ,0,10,10,10,10,10,10,10,10,10,10, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	},{
		{ 0,0 ,0 ,0 ,0 ,0, 0, 0, 0,0 ,0 ,0 , 0,0 , 0, 0},
		{ 0,0 ,0 ,0 ,0 ,0, 0, 0, 0,0 ,0 ,11, 0,0 , 0, 0},
		{ 0,0 ,10,10,1 ,1, 1, 1, 1, 1 ,1 ,1, 1,10,10, 0},
		{ 0,0 ,10,10,1 ,1, 1, 1, 1, 1 ,1 ,1, 1,10,10, 0},
		{ 0,0 ,12,12,1 ,0, 0, 3, 3, 3 ,0 ,0, 1,10,10, 0},
		{ 0,0 ,12,12,1 ,0,10,10,10,10 ,10,0, 1,10,10, 0},
		{ 0,0 ,12,0 ,1 ,0,10,1 ,1 ,1  ,10,0, 1,0 ,10, 0},
		{ 0,0 ,12,0 ,1 ,5,10,4 ,13,1  ,10,4, 1, 0,10, 0},
		{ 0,0 ,12,0 ,1 ,0,10,1 ,1 ,1  ,10,0, 1,0 ,10, 0},
		{ 0,0 ,12,12,1 ,0,12,12,6 ,10 ,10,0, 1,10,10, 0},
		{0 ,0 ,12,12,1 ,1, 1, 1, 3, 1, 1, 1, 1, 10,10,0},
		{0 ,0 ,12,12,1 ,1, 1, 1, 3, 1, 1, 1, 1, 10,10,0},
		{0 ,0 ,12,12,1 ,0, 0, 1, 1, 1, 0, 0, 1, 10,10,0},
		{0 ,0 ,12,12,1 ,0, 0, 1,10, 1, 0, 0, 1, 10,10,0},
		{0 ,0 ,12,12,1 ,0, 0, 1,10, 1, 0, 0, 1, 10,10,0},
		{0 ,0 ,0 , 0,0 ,0, 0, 0, 0, 0, 0, 0, 0,  0, 0,0},
	},{
		{0 ,1 ,1 ,10,10,10,10,10,10,10,10,10,10,10,10,10},
		{0 ,1 ,13,10,10,10,12,12,12,10,10,10,10,10,10,10},
		{0 ,1 ,1 ,1 ,1 ,12 ,12,0 ,12,12,12, 1, 1, 1,10,10},
		{0 ,1 ,1 ,1 ,1 ,12 ,12,12,12,12 ,10,10,10,10,10,10},
		{0 ,3 ,1 ,0 ,0 ,1 ,12,11,12,1 , 8, 8, 4, 4,10,10},
		{0 ,10,10,0 ,0 ,1 ,6 ,12,12,1 , 8, 8, 4, 4,10,10},
		{0 ,6 ,6 ,0 ,0 ,1 ,12, 7,12, 1, 0, 0, 0, 0,12,12},
		{0 ,6 ,6 ,0 ,0 ,1 ,12, 7,12, 3,0 ,0 ,12,12,12,12},
		{0 ,0 ,0 ,0 ,0 ,1 ,12,1 ,12, 3,0 ,0 ,12,0 ,0 ,0 },
		{1 ,1 ,1 , 0, 0,1 ,12,1 ,12,3 , 0, 0,12, 0,0 , 0},
		{1 ,1 ,1 ,1 ,1 ,1 ,12,10,10,12,1 , 1,1 ,1 ,1 ,0},
		{1 ,0 ,1 ,1 ,0 ,12,12,12,1, 4, 4, 4, 4, 1, 1, 0},
		{1 ,1 ,1 ,1 ,0 ,12,12,12,1, 1, 1, 1, 1, 1, 1, 0},
		{0 ,1 ,0 ,0 ,0 ,0, 0, 1,10, 4, 4, 1,12,12,12, 0},
		{0 ,1 ,0 ,0 ,0 ,0, 0, 1,10, 1, 5, 1,12,12,12, 0},
		{0 ,12,10,1 ,1 ,1,10,10, 5,10, 0, 0, 0, 0, 0, 0},
	},{
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0 ,0 ,13,10,10,10,10,12,12,12,5 ,12,4 ,12,12,0},
		{0 ,0 ,1 ,0 ,1 ,0, 1, 0, 12, 0,12, 0,12, 0,12,0},
		{0 ,0 ,1 ,7 ,12,5 ,12,4 ,12,12,12,10,10,12,12,0},
		{0 ,0 ,1 ,0 ,1 ,0, 1, 0,12, 0,12, 0,10, 0,12, 0},
		{0 ,0 ,1 ,1 ,10,4,10,12,12,12,12,12,10,10,10,0},
		{0 ,0 ,10,0 ,1 ,0, 1, 0, 1, 0,12, 0, 1, 0, 1, 0},
		{0 ,0 ,10,12,12,1, 1, 1, 9, 1,12, 1, 0, 1, 1, 0},
		{0 ,0 ,10,0 ,1 ,0, 1, 0, 1, 0,12, 0, 1, 0, 1, 0},
		{0 ,0 ,6 ,1 ,1 ,0, 1, 1,10,4,12,12,10, 1, 1, 0},
		{0 ,0 ,3 ,0 ,1 ,0, 1, 0,10, 0, 7, 0,2, 0,1, 0},
		{0 ,0 ,1 ,4 ,10,10,10,1,10, 1, 1, 1,10,10,10, 0},
		{0 ,0 ,12,0 ,12,0,12, 0,10, 0, 0, 0, 6, 0, 0, 0},
		{0 ,0 ,12,12,12,12,12,12,10,9, 1,12,12,12,11, 0},
		{0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	}
	
	};
	public static int[][][] testHightMap = {
		{
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		},{
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		},{
		{2,2,2,2,2,2,2,2,0,0,0,0,0,0,1,1},
		{2,2,2,2,2,2,2,2,0,0,0,1,1,1,1,1},
		{1,1,2,0,0,1,2,2,0,0,0,1,1,1,1,1},
		{0,0,0,0,0,0,2,2,0,0,0,1,1,1,1,1},
		{0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	},{
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,4,4,4,4,4,3,0,0,0,0,0,0,0,0,0},
		{0,4,3,2,1,1,1,1,0,0,0,0,0,0,0,0},
		{0,4,4,4,4,4,2,0,0,0,0,0,0,0,0,0},
		{0,4,4,4,4,3,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,1,2,3,4,0,0,0,0,0,0,1,1,1},
		{0,0,0,1,2,3,4,0,0,0,0,0,0,1,1,1},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
		{0,0,0,0,0,0,2,2,2,0,0,0,0,1,1,1},
		{0,2,2,0,0,0,2,2,2,1,0,0,0,2,2,2},
		{0,0,2,1,1,1,1,1,1,1,0,0,0,2,2,2},
		{0,2,2,0,0,0,2,2,2,0,0,0,0,2,2,2},
		{0,0,0,0,0,0,2,2,2,0,0,0,0,2,2,2},
	},{
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,2,2,2,2,0,0,0,0,0,0,1,1,1,1},
		{0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{0,0,2,2,2,2,0,0,0,0,0,0,0,0,0,0},
		{0,0,2,0,2,1,0,0,0,0,0,0,0,0,0,0},
		{0,0,2,0,2,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,2,0,2,1,1,0,0,0,0,0,0,0,0,1},
		{0,0,2,0,2,1,1,0,0,0,0,0,0,0,0,1},
		{0,0,2,0,2,0,0,0,0,0,0,0,1,1,1,1},
		{0,0,2,0,2,0,0,0,0,0,0,0,1,0,0,0},
		{0,0,2,0,2,0,0,0,0,1,2,2,2,0,0,0},
		{0,0,2,0,2,0,0,0,0,1,2,2,0,0,0,0},
		{0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0},
		{0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	},{
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
		{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
		{0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0},
		{0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0},
		{0,0,1,1,0,0,1,1,1,1,1,0,0,1,1,0},
		{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0},
		{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0},
		{0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0},
		{0,0,1,1,0,0,1,1,1,1,1,0,0,1,1,0},
		{0,0,1,1,0,0,0,0,1,0,0,0,0,1,1,0},
		{0,0,1,1,3,3,3,3,2,3,3,3,3,1,1,0},
		{0,0,1,1,3,0,0,3,3,3,0,0,3,1,1,0},
		{0,0,2,2,3,0,0,3,3,3,0,0,3,2,2,0},
		{0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	},{
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0},
		{0,0,1,1,1,1,1,0,1,1,1,1,1,1,0,0},
		{0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,0},
		{0,0,1,0,0,1,0,3,0,1,2,2,1,0,0,0},
		{0,1,1,0,0,1,0,0,0,1,2,2,1,0,0,0},
		{0,1,1,0,0,1,0,4,0,1,0,0,0,0,0,0},
		{0,1,1,0,0,1,0,4,0,1,0,0,0,0,0,0},
		{0,0,0,0,0,1,0,4,0,2,0,0,0,0,0,0},
		{0,0,0,0,0,1,0,4,0,3,0,0,0,0,0,0},
		{0,0,0,1,1,1,0,4,4,4,0,0,0,0,0,0},
		{0,0,1,1,0,0,0,0,4,3,2,1,0,0,0,0},
		{0,0,0,0,0,0,0,0,4,4,4,4,4,4,0,0},
		{0,0,0,0,0,0,0,0,4,3,2,2,0,0,0,0},
		{0,0,0,0,0,0,0,0,4,1,1,2,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
	},{
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
		{0,0,0,0,2,0,2,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0},
		{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
		{0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	}
	
};
	
}
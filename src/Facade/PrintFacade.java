package Facade;

import Facade.PrintProcess.FinishPrint;
import Facade.PrintProcess.Laser;
import Facade.PrintProcess.Paint;
import Facade.PrintProcess.Paper;
import Facade.PrintProcess.Print;
import Facade.PrintProcess.Rollers;

public class PrintFacade {

	Paper paper = new Paper();
	Paint paint = new Paint();
	Rollers rollers = new Rollers();
	Laser laser = new Laser();
	Print print = new Print();
	FinishPrint finishPrint = new FinishPrint();
	
	
	public void printPhoto() {
		paper.putPaper();
		paint.getPaint();
		rollers.movePaper();
		laser.prepare();
		print.print();
		finishPrint.finish();
	}
	
}

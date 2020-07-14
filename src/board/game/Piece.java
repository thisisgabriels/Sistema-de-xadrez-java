package board.game;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	//A posi��o de uma pe�a recem criada ser� como nula, dizendo que 
	// pe�a n�o foi colocada no tabuleiro ainda.

	protected Board getBoard() {
		return board;
	}
	
	
}

package board.game;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	//A posição de uma peça recem criada será como nula, dizendo que 
	// peça não foi colocada no tabuleiro ainda.

	protected Board getBoard() {
		return board;
	}
	
	
}

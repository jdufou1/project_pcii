package pcii_project.models.data;

import pcii_project.models.*;

public class DataGame {

	/* Constantes */
	
	/* Attributs */
	
	private int score_player;
	
	private int position_player;
	
	/* Constructors */
	
	public DataGame() {
		score_player = 0;
		position_player = (int) ((Model.WIDTH_MAX - Model.WIDTH_MIN) / 2) - (Cars.WIDTH_MAX_CARS / 2);
	}
	
	/* getters and setters */
	
	public int getScorePlayer() {
		return score_player;
	}
	
	public int getPositionPlayer() {
		return position_player;
	}
	
	public void setScorePlayer(int score_player) {
		this.score_player = score_player;
	}
	
	public void setPositionPlayer(int position_player)
	{
		this.position_player = position_player;
	}
	
	public int getRelativePositionPlayer(int max_width) {
		double relative_x = (double) getPositionPlayer() / (double)(Model.WIDTH_MAX - Model.WIDTH_MIN);
		int x = (int) (relative_x * max_width);
		return x;
	}
}
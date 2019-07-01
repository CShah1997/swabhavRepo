package com.techlabs.game_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.techlabs.exception.CellIsAlredyMarkedException;
import com.techlabs.game.Game;
import com.techlabs.game.GameState;

public class GameFrameListner implements ActionListener{

	private GameFrame gameFrame;
	private Game game;
	private GameState status;
	
	public GameFrameListner(GameFrame gameFrame, Game game) {
		this.gameFrame=gameFrame;
		this.game=game;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==gameFrame.button1)
		{
			status=game.play(0, 0);
			gameFrame.setStatus(status.toString());
			gameFrame.button1.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button2)
		{
			status=game.play(0, 1);
			gameFrame.setStatus(status.toString());
			gameFrame.button2.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button3)
		{
			status=game.play(0, 2);
			gameFrame.setStatus(status.toString());
			gameFrame.button3.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button4)
		{
			status=game.play(1, 0);
			gameFrame.setStatus(status.toString());
			gameFrame.button4.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button5)
		{
			status=game.play(1, 1);
			gameFrame.setStatus(status.toString());
			gameFrame.button5.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button6)
		{
			status=game.play(1, 2);
			gameFrame.setStatus(status.toString());
			gameFrame.button6.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button7)
		{
			status=game.play(2, 0);
			gameFrame.setStatus(status.toString());
			gameFrame.button7.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button8)
		{
			status=game.play(2, 1);
			gameFrame.setStatus(status.toString());
			gameFrame.button8.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		if(event.getSource()==gameFrame.button9)
		{
			status=game.play(2, 2);
			gameFrame.setStatus(status.toString());
			gameFrame.button9.setText(game.getCurrentPlayer().getMark().toString());
			gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		}
		
		if(status==GameState.WON)
		{
			JOptionPane.showMessageDialog(gameFrame, "Winner is " + game.getCurrentTurn().getName(), "GameResult",
					JOptionPane.PLAIN_MESSAGE);
			gameFrame.dispose();
		}
		
		if(status==GameState.DRAW)
		{
			JOptionPane.showMessageDialog(gameFrame, status, "GameResult", JOptionPane.PLAIN_MESSAGE);
			gameFrame.dispose();
		}
	}
}
	


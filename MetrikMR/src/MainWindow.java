import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame implements WindowListener {
	
	private int _x;
	private int _y;
	
	public MainWindow( int windowSizeX, int windowSizeY ) {
		
		this._x = windowSizeX;
		this._y = windowSizeY;
		
		setTitle( "Programm Softwaretechnik" );
		setSize( _x, _y );
		
		addWindowListener( this );
		add( new DrawObjects( _x, _y ) );
		
	} // MainWindow
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void openWindow() {
		setVisible(true);
	} // openWindow

	@Override
	public void windowActivated( WindowEvent e ) {
		
	} // windowActivated

	@Override
	public void windowClosed( WindowEvent e ) {
		
	} // windowClosed

	@Override
	public void windowClosing( WindowEvent e ) {
		dispose();
		System.exit(0);
	} // windowClosing

	@Override
	public void windowDeactivated( WindowEvent e ) {
		
	} // windowDeactivated

	@Override
	public void windowDeiconified( WindowEvent e ) {
		
	} // windowDeiconified

	@Override
	public void windowIconified( WindowEvent e ) {
		
	} // windowIconified

	@Override
	public void windowOpened( WindowEvent e ) {
		
	} // windowOpened
	
} // MainWindow

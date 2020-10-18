import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawObjects extends Canvas implements MouseListener {
	
	private float _x;
	private float _y;
	private int _counter;
	private int _sizeX = 0;
	private int _sizeY = 0;	
		
	public DrawObjects( int sizeX, int sizeY ) {
		
		this._sizeX = sizeX;
		this._sizeY = sizeY;
		
		_x = 0;
		_y = 0;
		_counter = 0;
		
		setSize( _sizeX, _sizeY );
		setBackground( Color.green );
		
		addMouseListener( this );
		
	} // DrawObjects
	
	@Override
	public void paint( Graphics g ) {
		
		if ( _x == 0 && _y == 0 ) {
			return;
		}
		
		Graphics2D g2D = ( Graphics2D ) g;
		g2D.setStroke( new BasicStroke( 3.0F ) );
		
		Graphics2D rec = ( Graphics2D ) g;
		rec.setStroke( new BasicStroke( 3.0F ) );
		
		Ellipse2D ellipse2D = new Ellipse2D.Float( _x, _y, 100, 100 );
		Rectangle2D rectangle2D = new Rectangle2D.Float( _x, _y, 100, 100 );
		
		g2D.draw( ellipse2D );
		rec.draw( rectangle2D );
		
		if( _counter > 1 ) {
			g2D.clearRect(0, 0, _sizeX, _sizeY);
			_counter = -1;				
		}
		
	} // paint

	@Override
	public void mouseClicked( MouseEvent e ) {
		
		_x = e.getX();
		_y = e.getY();
		
		paint( getGraphics() );
		_counter++;
		
	} // mouseClicked

	@Override
	public void mouseEntered( MouseEvent e ) {
		
	} // mouseEntered

	@Override
	public void mouseExited( MouseEvent e ) {
		
	} // mouseExited

	@Override
	public void mousePressed( MouseEvent e ) {
		
	} // mousePressed

	@Override
	public void mouseReleased( MouseEvent e ) {
		
	} // mouseReleased
	
} // DrawObjects

package de.ratopi.jeews;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class EchoEndpoint
{
	@OnMessage
	public void onMessage( final Session session, final String msg )
	{
		try
		{
			session.getBasicRemote( ).sendText( "Server handled : " + msg );
		}
		catch ( IOException e )
		{
			e.printStackTrace( );
		}
	}
}

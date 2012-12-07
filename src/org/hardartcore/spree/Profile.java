package org.hardartcore.spree;

import org.hardartcore.utils.Consts;

public class Profile {
	
	public Profile(){
		
	}
	
	public long _id;
	public String _server;
	public int _port;
	public String _name;
	public String _apiKey;
	public boolean _useSSL;
	public boolean _allowUnsigned;
	
	public long getId() {
		return _id;
	}
	public void setId(long id) {
		this._id = id;
	}
	public String getServer() {
		return _server;
	}
	public void setServer(String server) {
		this._server = server;
	}
	public int getPort() {
		return _port;
	}
	public void setPort(int port) {
		this._port = port;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	public String get_apiKey() {
		return _apiKey;
	}
	public void set_apiKey(String _apiKey) {
		this._apiKey = _apiKey;
	}
	public boolean is_useSSL() {
		return _useSSL;
	}
	public void set_useSSL(boolean _useSSL) {
		this._useSSL = _useSSL;
	}
	public boolean is_allowUnsigned() {
		return _allowUnsigned;
	}
	public void set_allowUnsigned(boolean _allowUnsigned) {
		this._allowUnsigned = _allowUnsigned;
	}
	
	public void set(long id, String server, String name, String apiKey){
		this.init(id, server, name, apiKey, Consts.DEFAULT_PORT);
	}
	
	public void set(long id, String server, String name, String apiKey, int port){
		this.init(id, server, name, apiKey, port);
	}

	private void init(long id, String server, String name, String apiKey, int port){
		this._id = id;
		this._server = server;
		this._name = name;
		this._apiKey = apiKey;
		this._port = port;
	}
	
}

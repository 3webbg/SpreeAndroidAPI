package org.hardartcore.spree;

public class Profile {
	
	public Profile(){
		
	}
	
	public long id;
	public String server;
	public int port;
	public String name;
	public String _apiKey;
	public boolean _useSSL;
	public boolean _allowUnsigned;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

}

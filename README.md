gwt-recaptcha - V2
===========


   GWT wrapper on top of recaptcha V2 Javascript API 
   
**Usage**
--------
Inherit main GWT module ``` <inherits name="com.agnie.gwt.recaptcha.ReCaptcha" />```

**Example**

Java :

```
    ReCaptcha rc = new ReCaptcha();
		rc.setSitekey("your public site key");
		RootPanel.get().add(rc);
```

UiBinder:

```
<!DOCTYPE ui:UiBinder SYSTEM "http://dl.google.com/gwt/DTD/xhtml.ent">
<ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
	xmlns:g="urn:import:com.google.gwt.user.client.ui" xmlns:re="urn:import:com.agnie.gwt.recaptcha.client">
	<ui:style>
	
	</ui:style>
	<g:HTMLPanel>
		<re:ReCaptcha theme="DARK" size="COMPACT"
			sitekey="your public site key"></re:ReCaptcha>
	</g:HTMLPanel>
</ui:UiBinder> 
```

For complete example with backend refer recaptcha-sample in source code.


**Maven Dependency**
```
		<dependency>
			<groupId>com.agnie.gwt</groupId>
			<artifactId>recaptcha</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>
```

**Maven Repository**

```
   <repositories>
      <repository>
         <id>Agnie repo</id>
         <url>https://github.com/pandurangpatil/mvn-repo/raw/master/releases</url>
      </repository>
   </repositories>
```


# VSCode Java Test 02.

## 目次

* [概要](#概要)
* [使い方](#使い方)
* [ライセンス](#ライセンス)
* [使用しているライブラリ](#使用しているライブラリ)

## 概要

以下の環境でVSCodeからのテストが正常に動作しないことを確認するプロジェクトです。  
* Windows 10 Pro 
* Visual Studio Code 1.56
* Java Extension Pack 0.14.0
* Java Test Runner 0.29.0

## 使い方

* 正常確認手順
	1. VSCodeJavaTest02.code-workspaceからVisual Studio Codeを起動する。
	1. TERMINALで『./gradlew test』と入力する。
	1. BUILD SUCCESSFULと表示される。

* 異常確認手順
	1. VSCodeJavaTest01.code-workspaceからVisual Studio Codeを起動する。
	1. エクスプローラーから、Test02Testsを開く。
	1. ファイル内のtestメソッド上部に表示されるRunを実行する。
	1. DEBUG CONSOLEに例外のスタックトレースが表示される。

		```
		java.util.ServiceConfigurationError: org.junit.platform.engine.TestEngine: Error locating configuration files
			at java.base/java.util.ServiceLoader.fail(ServiceLoader.java:581)
			at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.nextProviderClass(ServiceLoader.java:1198)
			at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.hasNextService(ServiceLoader.java:1220)
			at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.hasNext(ServiceLoader.java:1264)
			at java.base/java.util.ServiceLoader$2.hasNext(ServiceLoader.java:1299)
			at java.base/java.util.ServiceLoader$3.hasNext(ServiceLoader.java:1384)
			at java.base/java.lang.Iterable.forEach(Iterable.java:74)
			at org.junit.platform.launcher.core.LauncherFactory.create(LauncherFactory.java:87)
			at org.junit.platform.launcher.core.LauncherFactory.create(LauncherFactory.java:67)
			at org.eclipse.jdt.internal.junit5.runner.JUnit5TestLoader.<init>(JUnit5TestLoader.java:34)
			at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
			at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
			at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
			at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
			at java.base/java.lang.Class.newInstance(Class.java:584)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.createRawTestLoader(RemoteTestRunner.java:371)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.createLoader(RemoteTestRunner.java:366)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.defaultInit(RemoteTestRunner.java:310)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.init(RemoteTestRunner.java:225)
			at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
		Caused by: java.nio.file.FileSystemException: \\VSCodeJavaTest02\bin\default\META-INF\services\org.junit.platform.engine.TestEngine: ネットワーク パスが見つかりません。

			at java.base/sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:92)
			at java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:103)
			at java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:108)
			at java.base/sun.nio.fs.WindowsFileAttributeViews$Basic.readAttributes(WindowsFileAttributeViews.java:53)
			at java.base/sun.nio.fs.WindowsFileAttributeViews$Basic.readAttributes(WindowsFileAttributeViews.java:38)
			at java.base/sun.nio.fs.WindowsFileSystemProvider.readAttributes(WindowsFileSystemProvider.java:194)
			at java.base/java.nio.file.Files.readAttributes(Files.java:1763)
			at java.base/jdk.internal.module.Resources.toFilePath(Resources.java:102)
			at java.base/jdk.internal.module.ModulePatcher$ExplodedResourceFinder.find(ModulePatcher.java:506)
			at java.base/jdk.internal.module.ModulePatcher$PatchedModuleReader.findResourceInPatch(ModulePatcher.java:302)
			at java.base/jdk.internal.module.ModulePatcher$PatchedModuleReader.find(ModulePatcher.java:358)
			at java.base/jdk.internal.loader.BuiltinClassLoader$2.run(BuiltinClassLoader.java:409)
			at java.base/jdk.internal.loader.BuiltinClassLoader$2.run(BuiltinClassLoader.java:404)
			at java.base/java.security.AccessController.doPrivileged(Native Method)
			at java.base/jdk.internal.loader.BuiltinClassLoader.findMiscResource(BuiltinClassLoader.java:403)
			at java.base/jdk.internal.loader.BuiltinClassLoader.findResources(BuiltinClassLoader.java:334)
			at java.base/java.lang.ClassLoader.getResources(ClassLoader.java:1466)
			at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.nextProviderClass(ServiceLoader.java:1195)
			... 18 more
		```

## ライセンス

いつも通りのライセンスです。  
zlibライセンス、MITライセンスでも利用できます。  

ただし、チーム（複数人）で使用する場合は、MITライセンスとしてください。  

## 使用しているライブラリ

特になし。

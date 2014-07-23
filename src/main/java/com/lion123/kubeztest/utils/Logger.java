package com.lion123.kubeztest.utils;

import org.apache.logging.log4j.Level;

import com.lion123.kubeztest.references.Reg;

import cpw.mods.fml.common.FMLLog;

public class Logger {
	
	public static void log(Level level,Object object)
	{
		FMLLog.log(Reg.MOD_NAME, level, String.valueOf(object));
	}
	
	public static void debug(Object object)
	{
		log(Level.DEBUG,object);
	}
	public static void all(Object object)
	{
		log(Level.ALL,object);
	}
	public static void error(Object object)
	{
		log(Level.ERROR,object);
	}
	public static void fatal(Object object)
	{
		log(Level.FATAL,object);
	}
	public static void info(Object object)
	{
		log(Level.INFO,object);
	}
	public static void trace(Object object)
	{
		log(Level.TRACE,object);
	}
	public static void warn(Object object)
	{
		log(Level.WARN,object);
	}
}

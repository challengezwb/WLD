/*
 * MATLAB Compiler: 4.18.1 (R2013a)
 * Date: Wed Apr 27 12:46:57 2016
 * Arguments: "-B" "macro_default" "-W" "java:test1,test" "-T" "link:lib" "-d" 
 * "F:\\WLD\\WLD\\Untitled3\\distrib\\doc\\test1\\src" "-w" 
 * "enable:specified_file_mismatch" "-w" "enable:repeated_file" "-w" 
 * "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" "-w" "enable:demo_license" 
 * "-v" 
 * "class{test:C:\\Users\\challengezwb\\Desktop\\abs.m,C:\\Users\\challengezwb\\Desktop\\conv2.m}" 
 */

package test1;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class Test1MCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "test1_DDD7E6274027902B4FC46434CC5F02D7";
    
    /** Component name */
    private static final String sComponentName = "test1";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(Test1MCRFactory.class)
        );
    
    
    private Test1MCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            Test1MCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{8,1,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}

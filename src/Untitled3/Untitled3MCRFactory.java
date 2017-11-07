/*
 * MATLAB Compiler: 4.18.1 (R2013a)
 * Date: Wed Apr 27 12:43:33 2016
 * Arguments: "-B" "macro_default" "-W" "java:Untitled3,Test" "-T" "link:lib" "-d" 
 * "F:\\WLD\\WLD\\Untitled3\\src" "-w" "enable:specified_file_mismatch" "-w" 
 * "enable:repeated_file" "-w" "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" 
 * "-w" "enable:demo_license" "-v" 
 * "class{Test:C:\\Users\\challengezwb\\Desktop\\abs.m,C:\\Users\\challengezwb\\Desktop\\conv2.m}" 
 */

package Untitled3;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class Untitled3MCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "Untitled3_78856E6A1AADEE668952EAB792F6161B";
    
    /** Component name */
    private static final String sComponentName = "Untitled3";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(Untitled3MCRFactory.class)
        );
    
    
    private Untitled3MCRFactory()
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
            Untitled3MCRFactory.class, 
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

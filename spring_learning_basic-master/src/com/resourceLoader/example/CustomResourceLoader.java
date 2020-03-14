package com.resourceLoader.example;

import java.io.IOException;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
 
public class CustomResourceLoader implements ResourceLoaderAware
{
 
    private ResourceLoader resourceLoader;
 
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
 
    public void showResourceData() throws IOException
    {
        //This line will be changed for all versions of other examples
        Resource banner = resourceLoader.getResource("file:c:/temp/filesystemdata.txt");
        
        
    }
}

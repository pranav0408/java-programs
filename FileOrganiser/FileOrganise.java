import java.io.*;

class FileOrganise{
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in) );
        while(true){
            try{
                System.out.println("Enter path");
                String path = in.readLine();
                File f = new File(path);

                // file exists
                if( f.exists() ){

                    // is directory 
                    if( f.isDirectory() ){
                        
                        // extension of file
                        String extension = "";

                        // path without file
                        String temp_path = "";
                        
                        //file name
                        String file_name = "";
                        
                        // loop to get all the files in directory
                        for( File get : f.listFiles() ){

                                // extracting extension
                                int i = get.toString().lastIndexOf('.');
                                if (i > 0) {
                                    extension = get.toString().substring(i+1);
                                }

                                // extracting path without file and extracting file name
                                int j = get.toString().lastIndexOf('\\');
                                if (j > 0) {
                                    temp_path = get.toString().substring(0,j+1);
                                    file_name = get.toString().substring(j+1);
                                }

                                // new directory
                                String dir_s = temp_path + extension;
                                File dir = new File(dir_s);
                                try{
                                    // checking directory does not exists and creating it and moving the pointer file into it
                                    if( !dir.exists() && get.isFile()){
                                        
                                        // creating new directory
                                        dir.mkdir();
                                        
                                        // new destination
                                        String dest = dir_s + '\\' + file_name;
                                        File dest_path = new File(dest);
                                        get.renameTo(dest_path);
                                        // System.out.println(dest);
                                    }
                                    // if directory exists and pointer is file then move it
                                    if ( dir.exists() && get.isFile() ){

                                        // new detination
                                        String dest = dir_s + '\\' + file_name;
                                        File dest_path = new File(dest);
                                        get.renameTo(dest_path);
                                        // System.out.println(dest);
                                    }
                                }
                                catch( Exception e ){
                                    System.out.println("Exception: "+e);
                                }
                        } // for loop ends

                        // break the while loop
                        break;           
                    }

                    // is file
                    else if( f.isFile() ){
                        System.out.println("Exception: No Directory Exception");
                        continue;
                    }

                }

                // file does not exists
                else{
                    System.out.println("Exception: Invalid Path");
                    continue;
                }

            } // global try ends

            // global catch for try
            catch( Exception e ){
                System.out.println("Exception: Invalid Path");
            }
        }
    }
}

// for java.nio.*;
// Path p = Paths.get(path);
// Stream <Path> st = Files.list(p);
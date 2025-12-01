<<<<<<< HEAD
public class file1 {
    private String message = "Hello, GitHub! - Version Main";
    private String author = "Mohamed Yassine Derbel";
    private String version = "1.0.0";  // NOUVEAU
    
    // ... rest du code
=======
package com.example.gitgithub;

public class file1 {
    private String message = "Bonjour GitHub!";
    private String author = "Mohamed Yassine Derbel";
    private String version = "1.0.0";
    private String description = "Formation Git";

    // Getters et Setters pour tous les champs...
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
>>>>>>> hotfix-critical-bug
}
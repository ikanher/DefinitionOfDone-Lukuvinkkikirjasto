Feature: All bookmarks can be browsed
    
    Scenario: all bookmarks can be retrieved from the database
        When  command list all is given
        Then  all bookmarks are printed
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.command;

import com.stan.domain.User;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class UserCommand {
    User userCommand;

    public UserCommand() {
    }

    public User getUserCommand() {
        return userCommand;
    }

    public void setUserCommand(User userCommand) {
        this.userCommand = userCommand;
    }
    
}

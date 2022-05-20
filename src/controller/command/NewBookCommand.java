/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.command;

import model.Book;
import model.dao.BookDAO;
import model.factories.BookFactory;
import org.json.JSONObject;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class NewBookCommand implements Command
{

    private final BookDAO bookDAO;

    public NewBookCommand(BookDAO bookDAO)
    {
        this.bookDAO = bookDAO;
    }

    @Override
    public void execute(JSONObject json)
    {
        Book book = new BookFactory().buildFrom(json);

        try
        {
            this.bookDAO.create(book);
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
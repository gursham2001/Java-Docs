package com.sparta.gs;

public interface SQLQueries {
    // sql query to print all
    public static final String SELECT_ALL = "SELECT * FROM public.user_db";

    // sql query to add one
    // ?,?,? are place holders
    String INSERT_INTO_DB = "INSERT INTO public.user_db (id, name, email) Values (?,?,?)";

    String UPDATE_USER = "UPDATE public.user.db SET name = ?, email = ? WHERE id = ?";


}

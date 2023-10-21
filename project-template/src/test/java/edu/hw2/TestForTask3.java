package edu.hw2;

import edu.hw2.Task3.DefaultConnectionManager;
import edu.hw2.Task3.FaultyConnection;
import edu.hw2.Task3.FaultyConnectionManager;
import edu.hw2.Task3.interfaces.Connection;
import edu.hw2.Task3.interfaces.ConnectionManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;


public class TestForTask3 {
    @Test
    @DisplayName("DefaultConnectionManager return Connection interface implementation")
    void check_DefaultConnectionManager_getConnection() {

        ConnectionManager connectionManager = new DefaultConnectionManager();

        Connection connection = connectionManager.getConnection();

        assertThat(connection).isInstanceOf(Connection.class);
    }

    @Test
    @DisplayName("FaultyConnectionManager return FaultyConnection")
    void check_FaultyConnectionManager_getConnection() {

        ConnectionManager connectionManager = new FaultyConnectionManager();

        Connection connection = connectionManager.getConnection();

        assertThat(connection).isInstanceOf(FaultyConnection.class);
    }
}

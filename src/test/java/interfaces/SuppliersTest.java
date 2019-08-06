package interfaces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import interfaces.Suppliers;

public class SuppliersTest
{
    static final String TEXT = "texto";
    static final Integer INTEGER = 1;
    static final double DOUBLE = 2.0;
    static final Long LONG = 3l;

    @Test
    public void supplierTest()
    {
        assertThat( Suppliers.supplier.get() ).isEqualTo( TEXT );
    }

    @Test
    public void booleanSupplierTest()
    {
        assertThat( Suppliers.booleanSupplier.getAsBoolean() ).isEqualTo( true );
    }

    @Test
    public void doubleSupplierTest()
    {
        assertThat( Suppliers.doubleSupplier.getAsDouble() ).isEqualTo( DOUBLE );
    }

    @Test
    public void intSupplierTest()
    {
        assertThat( Suppliers.intSupplier.getAsInt() ).isEqualTo( INTEGER );
    }

    @Test
    public void longSupplierTest()
    {
        assertThat( Suppliers.longSupplier.getAsLong() ).isEqualTo( LONG );
    }

}

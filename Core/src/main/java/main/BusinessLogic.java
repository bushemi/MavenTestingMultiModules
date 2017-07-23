/**
 * Domain classes used to testing multimodule's relationships
 *
 * These classes uses the DBService object
 *
 *
 * */

package main;

/**
 * @since 1.0
 * @author Igor
 * @version 1.0
*/
import testdao.DBService;
/**
 * BusinessLogic class.
 *
 */
public class BusinessLogic {

    /**
     *  private field.
     */
    private DBService service;

    /**
     * empty PUBLIC constructor.
     */
    public BusinessLogic() {

    }
    /**
     * PUBLIC constructor with parameter DBService.
     * @param dbService dbService
     */
    public BusinessLogic(final DBService dbService) {
        this.service = dbService;
    }
    /**
     *
     * @return service service
     */
    public final DBService getService() {
        return service;
    }
    /**
     * set field service.
     * @param dbService dbService
     */
    public final void setService(final DBService dbService) {
        this.service = dbService;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import team8bytesproject.Team8Bytes;

/**
 *
 * @author st4pler
 */
public class JUnitTest {
    
    @Test
        public void addingTwoNumbers()
        {
            Team8Bytes.add(1,1);
            
        }
    @Test
    public void addingTwoNumbersEqualsTwo(){
        Assert.assertEquals(2, Team8Bytes.add(1,1));
    }
    
    
}

import java.security.SecureRandom;
import java.util.concurrent.Callable;

// $FF: renamed from: co
public class class_172 implements Callable {

   // $FF: renamed from: ai int
   static final int field_2156 = 1;
   // $FF: renamed from: ce int
   public static final int field_2157 = 1;
   // $FF: renamed from: y int
   static final int field_2158 = 1024;
   // $FF: renamed from: hs int
   static int field_2159;


   // $FF: renamed from: u (byte) void
   public static void method_3706(byte var0) {
      try {
         class_72.field_577.method_5074();
         class_72.field_566.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "co.u(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   class_172() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "co.<init>(" + ')');
      }
   }

   // $FF: renamed from: v () java.lang.Object
   public Object method_3708() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   public Object call() {
      try {
         SecureRandom var2 = new SecureRandom();
         var2.nextInt();
         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "co.call(" + ')');
      }
   }

   // $FF: renamed from: y () java.security.SecureRandom
   static SecureRandom method_3709() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   // $FF: renamed from: f () java.security.SecureRandom
   static SecureRandom method_3710() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }
}

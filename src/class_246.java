import java.io.File;
import java.io.RandomAccessFile;

// $FF: renamed from: gk
public class class_246 {

   // $FF: renamed from: f int
   int field_2721;
   // $FF: renamed from: t int
   static final int field_2722 = 1;
   // $FF: renamed from: n int
   int field_2723;
   // $FF: renamed from: j int
   static int field_2724;
   // $FF: renamed from: v int
   int field_2725;
   // $FF: renamed from: bq jk
   static class_301 field_2726;


   // $FF: renamed from: <init> () void
   class_246() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: n (java.io.File, boolean, int) boolean
   public static boolean method_4711(File var0, boolean var1, int var2) {
      try {
         try {
            RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
            int var4 = var3.read();
            var3.seek(0L);
            var3.write(var4);
            var3.seek(0L);
            var3.close();
            if(var1) {
               if(var2 == 378705535) {
                  throw new IllegalStateException();
               }

               var0.delete();
            }

            return true;
         } catch (Exception var5) {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}

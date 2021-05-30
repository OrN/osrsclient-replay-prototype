
// $FF: renamed from: ia
public class class_273 {

   // $FF: renamed from: v int
   public static final int field_3194 = 0;
   // $FF: renamed from: p byte[][][]
   static byte[][][] field_3195;
   // $FF: renamed from: td int
   static final int field_3196 = 3;
   // $FF: renamed from: n int
   static final int field_3197 = 2;


   // $FF: renamed from: <clinit> () void
   static {
   }

   // $FF: renamed from: <init> () void
   class_273() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: d (io, int, byte[], byte[], int) void
   static final void method_5081(class_37 var0, int var1, byte[] var2, byte[] var3, int var4) {
      try {
         if(null == var0.field_176) {
            if(var4 != -26460885) {
               throw new IllegalStateException();
            }

            if(var2 == null) {
               return;
            }

            if(var4 != -26460885) {
               throw new IllegalStateException();
            }

            var0.field_176 = new byte[11][];
            var0.field_177 = new byte[11][];
            var0.field_178 = new int[11];
            var0.field_222 = new int[11];
         }

         var0.field_176[var1] = var2;
         if(var2 != null) {
            var0.field_175 = true;
         } else {
            var0.field_175 = false;

            for(int var5 = 0; var5 < var0.field_176.length; ++var5) {
               if(var4 != -26460885) {
                  throw new IllegalStateException();
               }

               if(var0.field_176[var5] != null) {
                  if(var4 != -26460885) {
                     throw new IllegalStateException();
                  }

                  var0.field_175 = true;
                  break;
               }
            }
         }

         var0.field_177[var1] = var3;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}

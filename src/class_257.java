
// $FF: renamed from: hf
public abstract class class_257 implements class_11 {

   // $FF: renamed from: v int
   protected int field_2898;


   // $FF: renamed from: ah (int, cf, boolean, int) int
   static int method_4948(int var0, class_90 var1, boolean var2, int var3) {
      try {
         if(var0 == 6800) {
            class_165.field_2054 += 1647125333;
            return 1;
         } else {
            if(var0 != 6801) {
               if(var3 == 637562399) {
                  throw new IllegalStateException();
               }

               if(6802 != var0) {
                  if(var0 == 6850) {
                     if(var3 == 637562399) {
                        throw new IllegalStateException();
                     }

                     class_165.field_2054 += 1647125333;
                     return 1;
                  }

                  if(6851 != var0) {
                     if(var0 != 6852) {
                        return 2;
                     }

                     if(var3 == 637562399) {
                        throw new IllegalStateException();
                     }
                  }

                  class_136.field_1752 += -1087727229;
                  return 1;
               }

               if(var3 == 637562399) {
                  throw new IllegalStateException();
               }
            }

            class_136.field_1752 += -1087727229;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hf.ah(" + ')');
      }
   }

   // $FF: renamed from: <init> (jd, kk, int) void
   protected class_257(class_295 var1, class_324 var2, int var3) {
      super();
      try {
         this.field_2898 = -1874604065 * var3;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hf.<init>(" + ')');
      }
   }
}

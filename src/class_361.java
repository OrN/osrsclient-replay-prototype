
// $FF: renamed from: ma
public class class_361 {

    // $FF: renamed from: p java.lang.String
   String field_4009;
   // $FF: renamed from: b boolean
   boolean field_4010;
   // $FF: renamed from: j jv
   class_306 field_4011;
   // $FF: renamed from: r int
   int field_4012;


   // $FF: renamed from: f (int) boolean
   boolean method_6297() {
      try {
         return this.field_4010;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: n (byte) int
   int method_6299(byte var1) {
      try {
         if(this.field_4012 * 134811513 < 33) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            }

            if(!this.field_4011.method_5403(class_254.field_2869.field_2873, this.field_4009)) {
               if(var1 >= 0) {
                  throw new IllegalStateException();
               }

               return 134811513 * this.field_4012;
            }

            this.field_4012 = 805733353;
         }

         if(33 == 134811513 * this.field_4012) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            }

            if(this.field_4011.method_5420(class_254.field_2871.field_2873, this.field_4009, (byte)0)) {
               if(var1 >= 0) {
                  throw new IllegalStateException();
               }

               if(!this.field_4011.method_5403(class_254.field_2871.field_2873, this.field_4009)) {
                  return 134811513 * this.field_4012;
               }
            }

            this.field_4012 = 1611466706;
         }

         if(this.field_4012 * 134811513 == 66) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            }

            if(!this.field_4011.method_5403(this.field_4009, class_254.field_2872.field_2873)) {
               if(var1 >= 0) {
                  throw new IllegalStateException();
               }

               return this.field_4012 * 134811513;
            }

            this.field_4012 = 1140110980;
            this.field_4010 = true;
         }

         return this.field_4012 * 134811513;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: y (int) int
   int method_6302() {
      try {
         return 134811513 * this.field_4012;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: <init> (jv) void
   class_361(class_306 var1) {
      super();
      try {
         this.field_4012 = 0;
         this.field_4010 = false;
         this.field_4011 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: v (java.lang.String, byte) void
   void method_6307(String var1, byte var2) {
      try {
         if(var1 != null) {
            if(!var1.isEmpty()) {
               if(var1 == this.field_4009) {
                  if(var2 <= -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               this.field_4009 = var1;
               this.field_4012 = 0;
               this.field_4010 = false;
               this.method_6299((byte)-28);
               return;
            }

            if(var2 <= -1) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

}

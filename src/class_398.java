import java.util.zip.Inflater;

// $FF: renamed from: og
public class class_398 {

   // $FF: renamed from: v java.util.zip.Inflater
   Inflater field_4257;


   // $FF: renamed from: v (nd, byte[], byte) void
   public void method_6794(class_28 var1, byte[] var2, byte var3) {
      try {
         if(31 == var1.field_12[-442398587 * var1.field_15]) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            if(var1.field_12[-442398587 * var1.field_15 + 1] == -117) {
               if(null == this.field_4257) {
                  if(var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.field_4257 = new Inflater(true);
               }

               try {
                  this.field_4257.setInput(var1.field_12, 10 + -442398587 * var1.field_15, var1.field_12.length - (10 + -442398587 * var1.field_15 + 8));
                  this.field_4257.inflate(var2);
               } catch (Exception var5) {
                  this.field_4257.reset();
                  throw new RuntimeException("");
               }

               this.field_4257.reset();
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "og.v(" + ')');
      }
   }

   // $FF: renamed from: <init> (int, int, int) void
   void method_6795(int var1, int var2, int var3) {
      try {
         super();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "og.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (nd, byte[]) void
   public void method_6796(class_28 var1, byte[] var2) {
      if(31 == var1.field_12[-442398587 * var1.field_15] && var1.field_12[-442398587 * var1.field_15 + 1] == -117) {
         if(null == this.field_4257) {
            this.field_4257 = new Inflater(true);
         }

         try {
            this.field_4257.setInput(var1.field_12, 10 + -442398587 * var1.field_15, var1.field_12.length - (10 + -442398587 * var1.field_15 + 8));
            this.field_4257.inflate(var2);
         } catch (Exception var4) {
            this.field_4257.reset();
            throw new RuntimeException("");
         }

         this.field_4257.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: <init> () void
   public void method_6797() {
      try {
         this.method_6795(-1, 1000000, 1000000);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "og.<init>(" + ')');
      }
   }
}

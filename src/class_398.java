import java.util.zip.Inflater;

// $FF: renamed from: og
public class class_398 {

   // $FF: renamed from: v java.util.zip.Inflater
   Inflater field_4257;


   // $FF: renamed from: v (nd, byte[], byte) void
   public void method_6794(Buffer var1, byte[] var2, byte var3) {
      try {
         if(31 == var1.data[-442398587 * var1.offset]) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            if(var1.data[-442398587 * var1.offset + 1] == -117) {
               if(null == this.field_4257) {
                  if(var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.field_4257 = new Inflater(true);
               }

               try {
                  this.field_4257.setInput(var1.data, 10 + -442398587 * var1.offset, var1.data.length - (10 + -442398587 * var1.offset + 8));
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
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <init> (int, int, int) void
   // $FF: renamed from: <init> () void
   class_398() {
      super();
      try {
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (nd, byte[]) void
   public void method_6796(Buffer var1, byte[] var2) {
      if(31 == var1.data[-442398587 * var1.offset] && var1.data[-442398587 * var1.offset + 1] == -117) {
         if(null == this.field_4257) {
            this.field_4257 = new Inflater(true);
         }

         try {
            this.field_4257.setInput(var1.data, 10 + -442398587 * var1.offset, var1.data.length - (10 + -442398587 * var1.offset + 8));
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
}

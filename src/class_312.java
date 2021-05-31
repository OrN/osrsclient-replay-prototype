
// $FF: renamed from: ju
public class class_312 {

   // $FF: renamed from: p int
   public int field_3753;
   // $FF: renamed from: n int
   public int field_3754;
   // $FF: renamed from: v byte
   byte field_3755;
   // $FF: renamed from: y int
   public int field_3756;
   // $FF: renamed from: j int
   public int field_3757;
   // $FF: renamed from: f int
   public int field_3758;
   // $FF: renamed from: o op
   static class_66 field_3759;


   // $FF: renamed from: v (java.lang.Integer, int) void
   void method_5555() {
      try {
         ;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: n (int) int
   public int method_5558() {
      try {
         return this.field_3755 & 7;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (int) int
   public int method_5559(int var1) {
      try {
         byte var10000;
         if(8 == (this.field_3755 & 8)) {
            if(var1 != -1399016532) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (int, int) void
   void method_5560(int var1) {
      try {
         this.field_3755 &= -8;
         this.field_3755 = (byte)(this.field_3755 | var1 & 7);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> () void
   public class_312() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

    // $FF: renamed from: <init> (nd, boolean) void
   public class_312(Buffer var1, boolean var2) {
      super();
      try {
         this.field_3755 = var1.readByte();
         this.field_3754 = var1.readShort() * 515671321;
         this.field_3758 = var1.readInt() * 675729031;
         this.field_3756 = var1.readInt() * 1613502191;
         this.field_3753 = var1.readInt() * -1633742323;
         this.field_3757 = var1.readInt() * 609299645;
         if(var2) {
            int var4 = 0;
            boolean var5 = false;

            while(true) {
               int var6 = var1.readUnsignedByte();
               if(255 == var6) {
                  Integer var3 = var5?Integer.valueOf(var4):null;
                  this.method_5555();
                  break;
               }

               if(0 != var6) {
                  throw new IllegalStateException("");
               }

               while(true) {
                  int var7 = var1.readUnsignedByte();
                  if(255 == var7) {
                     break;
                  }

                  var1.offset -= -1025691571;
                  if(var1.readShort() != 0) {
                     throw new IllegalStateException("");
                  }

                  if(var5) {
                     throw new IllegalStateException("");
                  }

                  var4 = var1.readInt();
                  var5 = true;
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

    // $FF: renamed from: p (int, byte) void
   void method_5572(int var1, byte var2) {
      try {
         this.field_3755 &= -9;
         if(1 == var1) {
            if(var2 <= 103) {
               throw new IllegalStateException();
            }

            this.field_3755 = (byte)(this.field_3755 | 8);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

}

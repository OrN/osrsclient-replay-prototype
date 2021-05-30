import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

// $FF: renamed from: nm
public final class class_383 {

   // $FF: renamed from: f long
   long field_4209;
   // $FF: renamed from: n long
   final long field_4210;
   // $FF: renamed from: v java.io.RandomAccessFile
   RandomAccessFile field_4211;


   // $FF: renamed from: l () void
   public final void method_6684() throws IOException {
      this.method_6687(false, -1844052498);
   }

   // $FF: renamed from: b (byte[], int, int) void
   public final void method_6685(byte[] var1, int var2, int var3) throws IOException {
      if(8167831269062289551L * this.field_4209 + (long)var3 > 5188253846465837923L * this.field_4210) {
         this.field_4211.seek(this.field_4210 * 5188253846465837923L);
         this.field_4211.write(1);
         throw new EOFException();
      } else {
         this.field_4211.write(var1, var2, var3);
         this.field_4209 += 2621632103171946095L * (long)var3;
      }
   }

   // $FF: renamed from: n (byte[], int, int, byte) void
   public final void method_6686(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if(8167831269062289551L * this.field_4209 + (long)var3 > 5188253846465837923L * this.field_4210) {
            if(var4 == 15) {
               throw new IllegalStateException();
            } else {
               this.field_4211.seek(this.field_4210 * 5188253846465837923L);
               this.field_4211.write(1);
               throw new EOFException();
            }
         } else {
            this.field_4211.write(var1, var2, var3);
            this.field_4209 += 2621632103171946095L * (long)var3;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "nm.n(" + ')');
      }
   }

   protected void abm() throws Throwable {
      if(this.field_4211 != null) {
         System.out.println("");
         this.method_6701(-1125712384);
      }

   }

   // $FF: renamed from: y (boolean, int) void
   public final void method_6687(boolean var1, int var2) throws IOException {
      try {
         if(this.field_4211 != null) {
            if(var1) {
               if(var2 >= 1003938789) {
                  return;
               }

               try {
                  this.field_4211.getFD().sync();
               } catch (SyncFailedException var4) {
                  ;
               }
            }

            this.field_4211.close();
            this.field_4211 = null;
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "nm.y(" + ')');
      }
   }

   // $FF: renamed from: p (int) long
   public final long method_6688(int var1) throws IOException {
      try {
         return this.field_4211.length();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "nm.p(" + ')');
      }
   }

   // $FF: renamed from: j (byte[], int, int, byte) int
   public final int method_6689(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         int var5 = this.field_4211.read(var1, var2, var3);
         if(var5 > 0) {
            if(var4 >= 1) {
               throw new IllegalStateException();
            }

            this.field_4209 += 2621632103171946095L * (long)var5;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "nm.j(" + ')');
      }
   }

   protected void finalize() throws Throwable {
      try {
         if(this.field_4211 != null) {
            System.out.println("");
            this.method_6701(-520775983);
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "nm.finalize(" + ')');
      }
   }

   // $FF: renamed from: <init> (java.io.File, java.lang.String, long) void
   public void method_6690(File var1, String var2, long var3) throws IOException {
      try {
         super();
         if(var3 == -1L) {
            var3 = Long.MAX_VALUE;
         }

         if(var1.length() > var3) {
            var1.delete();
         }

         this.field_4211 = new RandomAccessFile(var1, var2);
         this.field_4210 = 2269086115354828363L * var3;
         this.field_4209 = 0L;
         int var5 = this.field_4211.read();
         if(var5 != -1 && !var2.equals("r")) {
            this.field_4211.seek(0L);
            this.field_4211.write(var5);
         }

         this.field_4211.seek(0L);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "nm.<init>(" + ')');
      }
   }

   protected void abr() throws Throwable {
      if(this.field_4211 != null) {
         System.out.println("");
         this.method_6701(-1855435807);
      }

   }

   // $FF: renamed from: v (long) void
   final void method_6691(long var1) throws IOException {
      try {
         this.field_4211.seek(var1);
         this.field_4209 = 2621632103171946095L * var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "nm.v(" + ')');
      }
   }

   // $FF: renamed from: r (long) void
   final void method_6692(long var1) throws IOException {
      this.field_4211.seek(var1);
      this.field_4209 = 2621632103171946095L * var1;
   }

   // $FF: renamed from: a () long
   public final long method_6693() throws IOException {
      return this.field_4211.length();
   }

   // $FF: renamed from: d (byte[], int, int) void
   public final void method_6694(byte[] var1, int var2, int var3) throws IOException {
      if(8167831269062289551L * this.field_4209 + (long)var3 > 5188253846465837923L * this.field_4210) {
         this.field_4211.seek(this.field_4210 * 5188253846465837923L);
         this.field_4211.write(1);
         throw new EOFException();
      } else {
         this.field_4211.write(var1, var2, var3);
         this.field_4209 += 2621632103171946095L * (long)var3;
      }
   }

   // $FF: renamed from: s () void
   public final void method_6695() throws IOException {
      this.method_6687(false, -829081404);
   }

   // $FF: renamed from: u () void
   public final void method_6696() throws IOException {
      this.method_6687(false, -1849462643);
   }

   // $FF: renamed from: g () long
   public final long method_6697() throws IOException {
      return this.field_4211.length();
   }

   // $FF: renamed from: o (boolean) void
   public final void method_6698(boolean var1) throws IOException {
      if(this.field_4211 != null) {
         if(var1) {
            try {
               this.field_4211.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field_4211.close();
         this.field_4211 = null;
      }

   }

   // $FF: renamed from: c (boolean) void
   public final void method_6699(boolean var1) throws IOException {
      if(this.field_4211 != null) {
         if(var1) {
            try {
               this.field_4211.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field_4211.close();
         this.field_4211 = null;
      }

   }

   // $FF: renamed from: e () long
   public final long method_6700() throws IOException {
      return this.field_4211.length();
   }

   protected void abj() throws Throwable {
      if(this.field_4211 != null) {
         System.out.println("");
         this.method_6701(-1900787857);
      }

   }

   // $FF: renamed from: f (int) void
   public final void method_6701(int var1) throws IOException {
      try {
         this.method_6687(false, -891531898);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "nm.f(" + ')');
      }
   }
}

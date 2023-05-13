<template>

    <v-card outlined>
        <v-card-title>
            CreateFile
        </v-card-title>

        <v-card-text>
            <string offline label="FileName" v-model="value.fileName" :editMode="editMode" @change="change"/>
            <string offline label="FileType" v-model="value.fileType" :editMode="editMode" @change="change"/>
            <int offline label="FileSize" v-model="value.fileSize" :editMode="editMode" @change="change"/>
            <string offline label="FilePath" v-model="value.filePath" :editMode="editMode" @change="change"/>
            <string offline label="FileOwner" v-model="value.fileOwner" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createFile"
            >
                CreateFile
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateFileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.fileName = {};
            this.value.fileType = {};
            this.value.fileSize = {};
            this.value.filePath = {};
            this.value.fileOwner = {};
        },
        watch: {
        },
        methods: {
            createFile() {
                this.$emit('createFile', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>


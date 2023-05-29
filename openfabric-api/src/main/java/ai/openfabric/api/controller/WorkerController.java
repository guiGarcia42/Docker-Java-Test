package ai.openfabric.api.controller;

import ai.openfabric.api.service.DockerManager;
import com.github.dockerjava.api.command.InspectContainerResponse;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("${node.api.path}/worker")
public class WorkerController {

    DockerManager dockerManager = new DockerManager();

    @PostMapping("/{id}/start")
    public void startWorker(@PathVariable("id") String workerId) {
        dockerManager.startContainer(workerId);
    }

    @PostMapping("/{id}/stop")
    public void stopWorker(@PathVariable("id") String workerId) {
        dockerManager.stopContainer(workerId);
    }

    @GetMapping("/{id}/information")
    public InspectContainerResponse getWorkerInformation(@PathVariable("id") String workerId) {
        return dockerManager.inspectContainer(workerId);
    }


    @PostMapping(path = "/hello")
    public @ResponseBody String hello(@RequestBody String name) {

        return dockerManager.listContainers().toString();
    }

}
